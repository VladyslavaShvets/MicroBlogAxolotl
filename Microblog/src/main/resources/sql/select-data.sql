
-- select N the newests public posts
SELECT Username, PostText, PostedDate FROM user 
INNER JOIN post ON user.UserId = post.UserId 
WHERE public
ORDER BY PostedDate DESC
LIMIT 10

-- select all followed users
SELECT Username AS FollowedUser, UserId AS FollowedUserId FROM  user WHERE UserId IN (
	SELECT FollowedUserId FROM user 
    INNER JOIN follower ON user.UserId = follower.UserId
    WHERE Username = 'Zosia'
)

-- select all posts created by users followed by user with given username
SELECT Username, PostText, PostedDate FROM user 
INNER JOIN post ON user.UserId = post.UserId  
WHERE user.UserId IN (
    SELECT FollowedUserId FROM user 
    INNER JOIN follower ON user.UserId = follower.UserId
    WHERE Username = 'Zosia'
)

