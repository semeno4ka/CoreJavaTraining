package day38_ExceptionsPart2;

public class ExceptionRecap {
    public static void main(String[] args) {
        /*
        Exceptions: unwanted/unexpected events

		Unchekced exceptions: occurs during the runtime

						All the RunetimeExceptions are unchecked exception

						unknown

		Checked exceptions: occurs during the compile time. must be handled right away

						All the non-RuntimeExceptions are checked exception

						known


Error vs Exceptions: Both are throwable, both can crash our program

		Exceptions: can occur during the compile time and runtime
					Occurs due to the issues within the program itself
					Recoverable, can be handled


		Error: Occurs during the runtime
			   Occurs due to the lack/limit of the system resources
			   Irrecoverable, not recommended to handle


Exception handlings:

		1. try & catch blocks: used for handling any checked & unchecked exception

					try{
						exception codes
					}catch(ExceptionClass e){
						e.printStackTrace();
					}


				multiple catch blocks: parent exception type can never be placed before child exception type

				finally block: always get executed regardless of the exception is handled or not handled

								System.exit(1)

         */
    }
}
