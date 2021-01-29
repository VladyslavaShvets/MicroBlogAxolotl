DROP SCHEMA PUBLIC CASCADE;

drop table user if exists;
create table user(
    UserId INTEGER IDENTITY NOT NULL PRIMARY KEY,
    UserName nvarchar(55) NOT NULL,
    BirthDate DATE NOT NULL,
    UserPassword nvarchar(30) NOT NULL,
    UserEmail nvarchar(30) NOT NULL,
);

drop table follower if exists;
create table follower(
PRIMARY KEY(UserId, FollowedUserId),
UserId INTEGER FOREIGN KEY  REFERENCES user(UserId),
FollowedUserId INTEGER FOREIGN KEY REFERENCES user(UserId)
);

drop table post if exists;
create table post(
    PostId INTEGER IDENTITY NOT NULL PRIMARY KEY,
    UserId INTEGER FOREIGN KEY REFERENCES user(UserId),
    PostText nvarchar(300) NOT NULL,
    Public BOOLEAN,
    PostedDate DATE NOT NULL,
);


