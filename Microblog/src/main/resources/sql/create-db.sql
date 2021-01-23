DROP SCHEMA PUBLIC CASCADE;

create table user(
    UserId INTEGER IDENTITY NOT NULL PRIMARY KEY,
    UserName nvarchar(55) NOT NULL,
    BirthDate DATE NOT NULL,
    UserPassword nvarchar(30) NOT NULL,
    UserEmail nvarchar(30) NOT NULL,

);

create table follower (
PRIMARY KEY(UserId, FollowedUserId),
UserId INTEGER FOREIGN KEY  REFERENCES user(UserId),
FollowedUserId INTEGER FOREIGN KEY REFERENCES user(UserId)
);

create table post (
    PostId INTEGER IDENTITY NOT NULL PRIMARY KEY,
    UserId INTEGER FOREIGN KEY REFERENCES user(UserId) NOT NULL,
    PostText nvarchar(300) NOT NULL,
    Public BOOLEAN,
    PostedDate DATE NOT NULL
);

