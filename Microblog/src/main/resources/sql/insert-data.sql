INSERT INTO user (Userid, UserName, BirthDate, UserPassword, UserEmail) VALUES (1,  'Ala', TO_DATE('17/12/1993', 'DD/MM/YYYY'), 'password123', 'ala93@onet.pl')
INSERT INTO user (Userid, UserName, BirthDate, UserPassword, UserEmail) VALUES (2,  'Bob', TO_DATE('23/08/1974', 'DD/MM/YYYY'), 'DWR34#222', 'bob@mail.com')
INSERT INTO user (Userid, UserName, BirthDate, UserPassword, UserEmail) VALUES (3,  'student', TO_DATE('01/04/1999', 'DD/MM/YYYY'), 'HASLOHASLO', 'studentmail@gmail.pl')

INSERT INTO follower (UserId, FollowedUserId) VALUES (1, 2)
INSERT INTO follower (UserId, FollowedUserId) VALUES (2, 3)
INSERT INTO follower (UserId, FollowedUserId) VALUES (2, 1)

INSERT INTO post (PostId, UserId, PostText, Public, PostedDate) VALUES (1, 1, 'Hello World', true, TO_DATE('07/11/2020', 'DD/MM/YYYY'))
INSERT INTO post (PostId, UserId, PostText, Public, PostedDate) VALUES (2, 2, 'Lorem Ipsum', true, TO_DATE('04/11/2020', 'DD/MM/YYYY'))
INSERT INTO post (PostId, UserId, PostText, Public, PostedDate) VALUES (3, 2, 'Dzień dobry', false, TO_DATE('05/11/2020', 'DD/MM/YYYY'))
INSERT INTO post (PostId, UserId, PostText, Public, PostedDate) VALUES (4, 3, 'abcd', true, TO_DATE('03/11/2020', 'DD/MM/YYYY'))
INSERT INTO post (PostId, UserId, PostText, Public, PostedDate) VALUES (5, 3, 'Testujemy', true, TO_DATE('07/11/2020', 'DD/MM/YYYY'))
