import java.sql.*;
class demo{
    public static void main(String[] args) throws Exception{
        /* import the packages
           load and register drivers
           create connection
           create statement
           execute statement
           process the result
           close
         */
        String url="jdbc:postgresql://localhost:5432/demo";
        String uname="postgres";
        String pass="212657";

        //String sql= "Select marks from student where sid=1";
        String create="insert into student values(5,'Max',55)";
        String upd="update student set sname='John' where sid=5";
        String del="delete from student where sid=5";
        String sql= "Select * from student";

     ;   //Class.forName("org.postgresql.Driver");   //optional for driver
        Connection con=DriverManager.getConnection(url,uname,pass);
        System.out.println("connection established");
        Statement st=con.createStatement();

        //create operation in db
        //st.execute(create);
        //update in db
        //st.execute(upd);

        //delete in db
        st.execute(del);
        
        //create a statement
        ResultSet rs=st.executeQuery(sql);      //used to get result from query
        // rs.next();                              //move 1 step next if we print it gives boolean value where data is present or not
        //int marks=rs.getInt("marks");              //to get string
        //System.out.println("marks of Student is "+marks);
        while(rs.next()){
            System.out.print(rs.getInt(1)+" ");
            System.out.print(rs.getString(2)+" ");
            System.out.println(rs.getInt(3));
        }
        con.close();

        System.out.println("connection closed");
    }
}
