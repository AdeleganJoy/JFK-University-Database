package Main;
import java.io.*;
import java.sql.*;
import java.util.*;

 /**
 *
 * @author AdeleganJoy
 */

 // This class is used to connect to the postgres database and get the information from the tables
public class DatabaseCode {
    private final String url = "jdbc:postgresql://localhost/postgres";
    private final String user = "postgres";
    private final String password = "abcxyz"; //type your own database password!
    public Scanner sc = new Scanner(System.in);
    
    // this method is used to print the department information from the department table
    public Connection departement(){
        Connection conn = null;
        try{
            
            conn = DriverManager.getConnection(url, user, password);

            String query = "select *from departement";
            Statement st = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(query);
            System.out.println("Department code"+"    "+"Counselor code"+"     "+"Department office"+
                    "    "+"Lead teacher code"+
                    "     "+"Building address"+"              "+"Department name");
            while(rs.next()){
                String DEPARTMENT_CODE = rs.getString(1);
                String DEP_NAME = rs.getString(2);
                String COUNSELOR_CODE  = rs.getString(3);
                String BUILDING_ADDRESS = rs.getString(4);
                String DEP_OFFICE = rs.getString(5);
                String TEACHER_CODE  = rs.getString(6);
                System.out.println(DEPARTMENT_CODE +"             "+ COUNSELOR_CODE + "           " + DEP_OFFICE + 
                        "                   "+TEACHER_CODE+"                  "+BUILDING_ADDRESS+"     "+DEP_NAME);
            }
            System.out.println("");

            st.close();
            conn.close();
            System.out.println("Closed");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
    
    // this method is used to print the room  information from the room table
     public Connection room(){
        Connection conn = null;
        try{
            
            conn = DriverManager.getConnection(url, user, password);

            String query = "select *from room";
            Statement st = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(query);
            System.out.println("Room number"+"    "+"Building address"+"              "+"Room type");
            while(rs.next()){
                String ROOM_NUMBER = rs.getString(1);
                String BUILDING_ADDRESS = rs.getString(2);
                String ROOM_TYPE  = rs.getString(3);
                
                System.out.println(ROOM_NUMBER + "            " + BUILDING_ADDRESS + "     " + ROOM_TYPE);
            }
            System.out.println("");

            st.close();
            conn.close();
            System.out.println("Closed");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
     
    // this method is used to print the teacher information from the teacher table
     public Connection teacher(){
        Connection conn = null;
        try{
            
            conn = DriverManager.getConnection(url, user, password);

            String query = "select *from teacher";
            Statement st = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(query);
            System.out.println("Teacher code" + "  "+"Department code"+"   "+"Employee number" +"     "+"Teaching speciality");
            while(rs.next()){
                String teacher_code = rs.getString(1);
                String department_code = rs.getString(2);
                String tea_speciality  = rs.getString(3);
                String emp_num  = rs.getString(4);
                
                System.out.println(teacher_code + "          " + department_code + "            " + emp_num + "               " 
                        + tea_speciality );
            }
            System.out.println("");

            st.close();
            conn.close();
            System.out.println("Closed");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
     
    // this method is used to print the counsellor information from the counsellor table
     public Connection counselor(){
        Connection conn = null;
        try{
            
            conn = DriverManager.getConnection(url, user, password);

            String query = "select *from counselor";
            Statement st = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(query);
            System.out.println("Counselor code"+"     "+"Department code"+"       "+"Employee number");
            while(rs.next()){
                String counselor_code = rs.getString(1);
                String department_code = rs.getString(2);
                String emp_num  = rs.getString(3);
                
                System.out.println(counselor_code + "               " + department_code 
                        + "                " + emp_num);
            }
            System.out.println("");

            st.close();
            conn.close();
            System.out.println("Closed");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
    
     // this method is used to print the enrollment information from the enrollment table
     public Connection enrollment(){
        Connection conn = null;
        try{
            
            conn = DriverManager.getConnection(url, user, password);

            String query = "select *from enrollment";
            Statement st = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String student_code = rs.getString(1);
                String course_code = rs.getString(2);
                String enr_accept_date = rs.getString(3);
                String enr_score = rs.getString(4);
                String enr_startdate = rs.getString(5);
                String enr_enddate = rs.getString(6);
                
                System.out.println(student_code + " " + course_code + " " + enr_accept_date + " " +
                        enr_score + " " + enr_startdate + " " + enr_enddate);
            }
            System.out.println("");

            st.close();
            conn.close();
            System.out.println("Closed");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
    // this method is used to print the university information from the university table
     public Connection university(){
        Connection conn = null;
        try{
            
            conn = DriverManager.getConnection(url, user, password);

            String query = "select *from university";
            Statement st = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String uni_code = rs.getString(1);
                String uni_name = rs.getString(2);
                String box_address  = rs.getString(3);
                System.out.println("University code: "+uni_code + "\nName: " + uni_name + "\nBox address: " + box_address);
            }
            System.out.println("");

            st.close();
            conn.close();
            System.out.println("Closed");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
    // this method is used to print the semester information from the semester table
     public Connection semester(){
        Connection conn = null;
        try{
            
            conn = DriverManager.getConnection(url, user, password);

            String query = "select *from semester";
            Statement st = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(query);
            System.out.println("Semester code"+"    "+"Start date"+"     "+"End date"+"       "+"Semester term");
            while(rs.next()){
                String semester_code = rs.getString(1);
                String sem_startdate = rs.getString(2);
                String sem_enddate  = rs.getString(3);
                String sem_term  = rs.getString(4);
                
                System.out.println(semester_code + "          " + sem_startdate 
                        + "     " + sem_enddate +"     " + sem_term);
            }
            System.out.println("");

            st.close();
            conn.close();
            System.out.println("Closed");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
    // this method is used to print the information for people with a gpa > 3.5  from the student table
     public Connection student1(){
        Connection conn = null;
        try{
            
            conn = DriverManager.getConnection(url, user, password);

            String query = "select *from student where st_gpa > 3.50";
            Statement st = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(query);
            System.out.println("Students that have GPA more than 3.50:\n");
            System.out.println("Student code"+"   "+"Student GPA"+"    "+"Student credits"
                    +"    "+"Department code"+"    "+ "Student first name"+"    "+"Student last name");
            while(rs.next()){
                String STUDENT_CODE = rs.getString(1);
                String ST_CREDITS = rs.getString(3);
                String st_gpa = rs.getString(16);
                String ST_FNAME = rs.getString(7);
                String ST_LNAME = rs.getString(6);
                String DEPARTEMENT_CODE = rs.getString(2);
                
                System.out.println(STUDENT_CODE + "       " +st_gpa + "           " + ST_CREDITS 
                        + "               " + DEPARTEMENT_CODE + "             " + ST_FNAME + "       " + ST_LNAME);
            }
            System.out.println("");

            st.close();
            conn.close();
            System.out.println("Closed");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
      // this method is used to prints student information of people that started studying on 2022-08-01
      public Connection student2(){
        Connection conn = null;
        try{
            
            conn = DriverManager.getConnection(url, user, password);

            String query = "select *from student where "
                    + "study_startdate = '2022--08-01'";
            Statement st = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(query);
            System.out.println("Students that have study starting date from 01.08.2022:\n");
            System.out.println("Student code"+"   "+"Student GPA"+"    "+"Student credits"
                    +"    "+"Department code"+"    "+ "Student first name"+"    "+"Student last name");
            while(rs.next()){
                String ST_CREDITS = rs.getString(1);
                String st_gpa = rs.getString(16);
                String ST_FNAME = rs.getString(7);
                String ST_LNAME = rs.getString(6);
                String STUDENT_CODE = rs.getString(1);
                String DEPARTEMENT_CODE = rs.getString(2);
                
                System.out.println(STUDENT_CODE + "       " +st_gpa + "           " + ST_CREDITS 
                        + "           " + DEPARTEMENT_CODE + "             " + ST_FNAME + "       " + ST_LNAME);
            }
            System.out.println("");

            st.close();
            conn.close();
            System.out.println("Closed");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
      // this method is used to get the student information from the student table
      public Connection student3(){
        Connection conn = null;
        try{
            
            conn = DriverManager.getConnection(url, user, password);

            String query = "select *from student";
            Statement st = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(query);
            System.out.println("Student codes, full names, social IDs, addresses:\n");
            System.out.println("Student code"+"    "+"Social ID"+"     "+"Student first name"
                    +"    "+"Student last name"+"    "+"Address");
            while(rs.next()){
                String STUDENT_CODE = rs.getString(1);
                String ST_SOCIAL_ID = rs.getString(4);
                String ST_LNAME = rs.getString(6);
                String ST_FNAME = rs.getString(7);
                String ST_ADDRESS = rs.getString(8);
                
                System.out.println(STUDENT_CODE + "        " + ST_SOCIAL_ID + "     " + 
                        ST_FNAME + "       " + ST_LNAME+"      "+ST_ADDRESS);
            }
            System.out.println("");

            st.close();
            conn.close();
            System.out.println("Closed");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
      // this method is used to get the course information from the course table
      public Connection student4(){
        Connection conn = null;
        try{
            
            conn = DriverManager.getConnection(url, user, password);

            String query = "select *from student";
            Statement st = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(query);
            System.out.println("Student codes, phone numbers, contact languages, emails:\n");
            System.out.println("Student code"+"   "+"Phone number"+"     "+"Contact Language"+"     "+"School email");
            while(rs.next()){
                String STUDENT_CODE = rs.getString(1);
                String ST_SCHOOLEMAIL = rs.getString(10);
                String ST_PHONENUM = rs.getString(9);
                String ST_CONTACTLANGUAGE = rs.getString(15);
                
                System.out.println(STUDENT_CODE + "       "  + 
                        ST_PHONENUM + "       " + ST_CONTACTLANGUAGE + "      "+ ST_SCHOOLEMAIL);
            }
            System.out.println("");

            st.close();
            conn.close();
            System.out.println("Closed");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
    // this method is used to get the course information from the course table
      public Connection course1(){
        Connection conn = null;
        try{
            
            conn = DriverManager.getConnection(url, user, password);

            String query = "select *from course";
            Statement st = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(query);
            System.out.println("Course descriptions, credits, duration:\n");
            System.out.println("Code"+"    "+"Credits" + "    "+
                       "Start date"+"    "+"End date" + "      " + "Course name and description");
            while(rs.next()){
                String COURSE_NAME = rs.getString(4);
                String COURSE_DESCRIPTION = rs.getString(3);
                String COURSE_CODE = rs.getString(1);
                String COURSE_CREDITS = rs.getString(2);
                String COURSE_STARTTIME = rs.getString(7);
                String COURSE_ENDTIME = rs.getString(8);
                
                System.out.println(COURSE_CODE + "    " + COURSE_CREDITS 
                        + "       " + COURSE_STARTTIME + "    " + COURSE_ENDTIME + "    "+ COURSE_NAME + " - " +COURSE_DESCRIPTION);
            }
            System.out.println("");

            st.close();
            conn.close();
            System.out.println("Closed");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
      // this method is used to get the course information from the course table
      public Connection course2(){
        Connection conn = null;
        try{
            
            conn = DriverManager.getConnection(url, user, password);

            String query = "select *from course";
            Statement st = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(query);
            System.out.println("Course languages, teachers code, departments code, max slots:\n");
            System.out.println("Course Code" + "   " + "Credits" +"    "+ "Language"
            + "       " + "Teacher code" + "     " + "Department code" + "   " + "Max slots" + "     " + "Course name");
            while(rs.next()){
                String COURSE_NAME = rs.getString(4);
                String COURSE_CODE = rs.getString(1);
                String COURSE_CREDITS = rs.getString(2);
                String COURSE_MAX_SLOTS = rs.getString(6);
                String COURSE_LANGUAGE = rs.getString(5);
                String TEACHER_CODE = rs.getString(10);
                String DEPARTMENT_CODE = rs.getString(9);
               
                System.out.println(COURSE_CODE + "          " + COURSE_CREDITS 
                        + "       " + COURSE_LANGUAGE + TEACHER_CODE 
                        + "             " + DEPARTMENT_CODE + "           " + COURSE_MAX_SLOTS +"           "+ COURSE_NAME );
                
            }
            System.out.println("");

            st.close();
            conn.close();
            System.out.println("Closed");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
      // this method is used to get the class information from the class table
      public Connection class1(){
        Connection conn = null;
        try{
            
            conn = DriverManager.getConnection(url, user, password);

            String query = "select *from class";
            Statement st = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String COURSE_CODE = rs.getString(2);
                String class_starttime = rs.getString(5);
                String class_endtime = rs.getString(6);
                String class_type = rs.getString(7);
                
                System.out.println("Course: " + COURSE_CODE + " Class start time: " + 
                        class_starttime + " Class end time: " + class_endtime + " Class type: "+ class_type);
            }
            System.out.println("");

            st.close();
            conn.close();
            System.out.println("Closed");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
      // this method is used to get the class information from the class table
      public Connection class2(){
        Connection conn = null;
        try{
            
            conn = DriverManager.getConnection(url, user, password);

            String query = "select *from class where class_type = 'TEACHING' and day = 'MONDAY'";
            Statement st = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String COURSE_CODE = rs.getString(2);
                String class_starttime = rs.getString(5);
                String class_endtime = rs.getString(6);
                
                System.out.println("Course: " + COURSE_CODE + " Class start time: " + 
                        class_starttime + " Class end time: " + class_endtime);
            }
            System.out.println("");

            st.close();
            conn.close();
            System.out.println("Closed");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
      // this method is used to get the employee information from the employee table
      public Connection employee(){
        Connection conn = null;
        try{
            
            conn = DriverManager.getConnection(url, user, password);

            String query = "select *from emplyee_record";
            Statement st = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(query);
            System.out.println("Employee info:");
            System.out.println("First name"+"     "+"Last name"+"       "+"Phone number"+"     "+"Email");
            while(rs.next()){
                String EMP_LNAME = rs.getString(2);
                String emp_fname = rs.getString(12);
                String EMP_PHONENUM = rs.getString(3);
                String EMP_EMAIL = rs.getString(5);

                
                System.out.println(emp_fname + EMP_LNAME + " " + EMP_PHONENUM + "       " + EMP_EMAIL);
            }
            System.out.println("");

            st.close();
            conn.close();
            System.out.println("Closed");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
        // this method is used to update the grade of a student in the enrollment table
        public Connection GradeUpgrade(String stu_code, String course_cod, int new_grade){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url, user, password);
            
            String query = "UPDATE enrollment SET enr_score = "+ new_grade + " WHERE student_code = " 
                    +stu_code + " and course_code = " + course_cod;
            //UPDATE enrollment SET enr_score = 4 WHERE student_code = '00000002' and course_code = 'ST03' // this example works in the database!
            Statement st = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(query);
            
            System.out.println("Updated grade!");
            String query2 = "select * from enrollment where student_code = " +stu_code;
            Statement st2 = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs2 = st.executeQuery(query2);
            String student_code = rs2.getString(1);
            String enr_score = rs2.getString(9);
            System.out.println("Student Code"+"  "+"Upgrade garde");
            System.out.println(student_code+"  "+enr_score);
            System.out.println("");
            st.close();
            conn.close();
            System.out.println("Closed");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
     
}

