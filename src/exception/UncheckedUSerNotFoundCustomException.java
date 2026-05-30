package exception;

public class UncheckedUSerNotFoundCustomException extends RuntimeException{
    public UncheckedUSerNotFoundCustomException(String message){
        super(message);
    }}

     class UserService{
        public static void main(String[] args) {
            findByUSerId(101);
        }

        public static void findByUSerId(int UserID){
            if (UserID !=1){
                throw new UncheckedUSerNotFoundCustomException("User not found with id:" +UserID );
            }
            System.out.println("User Found");
        }

        }


