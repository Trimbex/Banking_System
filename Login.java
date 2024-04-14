public class Login
{


    public Login() {}


    public void VerifyLogin(String Username,String Password)
    {


        //Check logininfo hashmap

        if (Customer.logininfo.containsKey(Username.toLowerCase()))
        {
            //Username found
            if(Customer.logininfo.get(Username.toLowerCase()).equals(Password))
            {
                // Password Match
                System.out.println("Success");
                /*
                TODO
                 REDIRECT TO DASHBOARD IN GUI
                 */
            }
            else
            {
                System.out.println("Incorrect Password");
            }
        }
        else
        {
            System.out.println("Username not found");
        }

    }
    /*
    TODO
     VerifyLogin(String Username,String Password)
     */

}
