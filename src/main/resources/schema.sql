
create table if not exists hotel(
    hotelId INT PRIMARY KEY AUTO_INCREMENT,
    hotelName varchar(255),
    location varchar(255),
    rating INT 
);


create table if not exists room(
    roomId INT PRIMARY KEY AUTO_INCREMENT,
    roomNumber varchar(255),
    type varchar(255),
    price DOUBLE,
    hotelId INT,
    FOREIGN KEY (hotelId) REFERENCES hotel(hotelId)
);

