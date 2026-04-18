package Example2.ProblamaticCode;

public class UserManager {
    
    public void add(User user)
    {
        if (user.getAge() < 18)
        {
            throw new IllegalArgumentException("User is not adult");
        }

        System.out.println("User Added");
    }

    public void delete (User user)
    {
        System.out.println("User deleted");
    }

    public void Update (User user)
    {
        if (user.getAge() < 18)
        {
            throw new IllegalArgumentException("User is not adult");
        }
        System.out.println("User updated");
    }

    public void get(User user)
    {
        System.out.println("user returned");
    }
                                                                                                        
    public void logUserActivity(User user)
    {
        System.out.println("User activity logged");
    }
}
