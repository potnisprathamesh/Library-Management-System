DROP DATABASE Library;

CREATE DATABASE Library;

USE library

CREATE TABLE Book 
(Book_id varchar (10) Not Null, 
Title varchar(100) Not Null,
CONSTRAINT pk_book primary key (Book_id));

load data local infile 'C:/Pratham/Pratham/CourseWork/Spring 14/DB/Project/Library_data/books_authors.csv' into table book fields terminated by '\t' enclosed by '"' lines terminated by '\n'  ignore 1 lines (book_id,@dummy,title);

CREATE TABLE Book_Authors(
    Book_id varchar (10) Not Null,
    Author_name char (100) Not Null,
    fname char (50),
    minit char (50),
    lname char (50),
    CONSTRAINT pk_authors primary key (Book_id,Author_name),
    CONSTRAINT fk_book_bauthors foreign key(Book_id) references Book(Book_id) ON DELETE CASCADE);


load data local infile 'C:/Pratham/Pratham/CourseWork/Spring 14/DB/Project/Library_data/books_authors.csv' into table Book_authors fields terminated by '\t' enclosed by '"' lines terminated by '\n'  ignore 1 lines (book_id,Author_name,@dummy) set author_name = (substring_index(author_name,',',1));

load data local infile 'C:/Pratham/Pratham/CourseWork/Spring 14/DB/Project/Library_data/books_authors.csv' into table Book_authors fields terminated by '\t' enclosed by '"' lines terminated by '\n'  ignore 1 lines (book_id,Author_name,@dummy) set author_name = substring_index(substring_index(author_name,',',2),',',-1);

load data local infile 'C:/Pratham/Pratham/CourseWork/Spring 14/DB/Project/Library_data/books_authors.csv' into table Book_authors fields terminated by '\t' enclosed by '"' lines terminated by '\n'  ignore 1 lines (book_id,Author_name,@dummy) set author_name = substring_index(substring_index(author_name,',',3),',',-1);

load data local infile 'C:/Pratham/Pratham/CourseWork/Spring 14/DB/Project/Library_data/books_authors.csv' into table Book_authors fields terminated by '\t' enclosed by '"' lines terminated by '\n'  ignore 1 lines (book_id,Author_name,@dummy) set author_name = substring_index(substring_index(author_name,',',4),',',-1);

load data local infile 'C:/Pratham/Pratham/CourseWork/Spring 14/DB/Project/Library_data/books_authors.csv' into table Book_authors fields terminated by '\t' enclosed by '"' lines terminated by '\n'  ignore 1 lines (book_id,Author_name,@dummy) set author_name = substring_index(substring_index(author_name,',',5),',',-1);


Update book_authors set fname = substring_index(ltrim(author_name),' ',1) ;
Update book_authors set lname = substring_index(substring_index(author_name,' (', 1),' ',-1);
Update book_authors set minit = substring_index(substring_index(trim(lname from (trim(fname from ltrim(author_name)))),' (',-1),')',-1);

Update book_authors set minit = Null where minit = ' ';
Update book_authors set fname = Null , minit = Null , lname = Null where author_name = 'Various';
Update book_authors set fname = Null , minit = Null , lname = Null where author_name = 'The Beatles';
Update book_authors set fname = Null , minit = Null , lname = Null where author_name = 'Los Angeles County Museum of Art California';
Update book_authors set lname = Null where author_name = 'Preiss-Glasser';


CREATE TABLE Library_Branch 
(Branch_id varchar (25) Not Null, 
Branch_name varchar (25), 
Address varchar(100), 
CONSTRAINT pk_lib_branch primary key (Branch_id));

load data local infile 'C:/Pratham/Pratham/CourseWork/Spring 14/DB/Project/Library_data/library_branch.csv' into table library_branch fields terminated by '\t' enclosed by '"' lines terminated by '\n'  ignore 1 lines (branch_id,branch_name,address);

CREATE TABLE Book_Copies 
(Book_id varchar (10) Not Null,
Branch_id varchar (25) Not Null,  
No_of_Copies int, 
CONSTRAINT pk_book_copies primary key(Book_id,Branch_id), 
CONSTRAINT fk_book_bcopies foreign key(Book_id) references Book(Book_id),
CONSTRAINT fk_lib_branch_bcopies foreign key(Branch_id) references Library_Branch(Branch_id) ON DELETE CASCADE);

load data local infile 'C:/Pratham/Pratham/CourseWork/Spring 14/DB/Project/Library_data/book_copies.csv' into table book_copies fields terminated by '\t' enclosed by '"' lines terminated by '\n'  ignore 1 lines (book_id,branch_id,No_of_Copies);

CREATE TABLE Borrowers
(Card_no int (5) Not Null auto_increment,
Fname varchar (25) Not Null,
Lname varchar(25) Not Null,
Address varchar (30) Not Null,
Phone varchar(20) Not Null,
CONSTRAINT pk_borrowers primary key(Card_no));

load data local infile 'C:/Pratham/Pratham/CourseWork/Spring 14/DB/Project/Library_data/borrowers.csv' into table borrowers fields terminated by '\t' enclosed by '"' lines terminated by '\n'  ignore 1 lines (card_no,fname,lname,@var,@var1,@var2	,phone) set address = Concat(@var,', ',@var1,', ',@var2);

CREATE TABLE Book_Loans
(Loan_id int Not Null Auto_Increment ,
Book_id varchar (25) Not Null,
Branch_id varchar (25) Not Null, 
Card_no int (5) Not Null,
Date_out date default Null,
Date_due date default Null,
Date_in date default Null,
CONSTRAINT pk_bloans primary key(Loan_id),
CONSTRAINT fk_bloans_book foreign key(Book_id) references Book(Book_id),
CONSTRAINT fk_bloans_libranch foreign key(Branch_id) references Library_Branch(Branch_id),
CONSTRAINT fk_bloans_borrowers foreign key(Card_no) references Borrowers(Card_no) ON DELETE CASCADE);


CREATE TABLE Fines
(Loan_Id int Not Null,
Fine_Amt Decimal (10,2),
Paid Boolean not null default 0,
CONSTRAINT pk_fines primary key(Loan_Id),
CONSTRAINT fk_bloans_fines foreign key(Loan_id) references Book_Loans(Loan_id) ON DELETE CASCADE);


load data local infile 'C:/Pratham/Pratham/CourseWork/Spring 14/DB/Project/Library_data/book_loans.csv' into table book_loans fields terminated by ',' enclosed by '"' lines terminated by '\n' ignore 1 lines (loan_id,book_id,branch_id,card_no,date_out,date_due,date_in);

Update book_loans
Set date_in = Null
where date_in = '0000-00-00';

Update fines
Set Paid = 0
where Paid = Null;












