package service;

import dao.userDAO;
import model.User;

import java.sql.SQLException;

public class userService {
    public static Integer saveUser(User user)
    {
        try{
            if(userDAO.isExists(user.getEmail()))
            {
                // agr user existkrta h mtlb duplicacy isliye false return hoga
                return 0;
            }
            else{
                return userDAO.saveUser(user);
            }
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
}
