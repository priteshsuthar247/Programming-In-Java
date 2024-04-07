public class _30 
{
    static class ArgumentGreaterThanOne extends Exception 
    {
        public ArgumentGreaterThanOne(String message) 
        {
            super(message);
        }
    }

    public static void main(String[] args)
    {
        try 
        {
            if (args.length > 1) 
            {
                throw new ArgumentGreaterThanOne("More than one argument provided.");
            }
            else if (args.length == 1)
            {
                System.out.println("The command line argument is:");
                System.out.println(args[0]);
            }
            else
            {
                System.out.println("No command line arguments found.");
            }
        } 
        catch (ArgumentGreaterThanOne e) 
        {
            e.printStackTrace();
        }
    }
}
