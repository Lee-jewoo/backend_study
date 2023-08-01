show user;

-- ���� 29. ���̺� �ۼ�
create table TB_CATEGORY
(NAME VARCHAR2(10),
 USE_YN CHAR(1) default 'Y');
 
-- ���� 30. ���̺� �ۼ�
create table TB_CLASS_TYPE
(NO VARCHAR2(5) constraint TB_CLASS_TYPE_no_pk primary key, 
 NAME VARCHAR2(10));
 
-- ���� 31. �������� �߰�
alter table TB_CATEGORY
add constraint TB_CATEGORY_NAME_PK primary key(name);

-- ���� 32. �������� �߰�
alter table tb_class_type
modify (name varchar(10) constraint tb_class_type_name_nn not null);

-- ���� 33. �÷� ����
alter table tb_class_type
modify (no varchar(10), name varchar(20));
alter table tb_category
modify (name varchar(20));