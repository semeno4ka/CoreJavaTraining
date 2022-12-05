package day12_CustomMethods;

public class CustomMethodIntro {
    //methods perform commands behind the seen, we see the result you call them to perform
    /*
    Java Methods => standard library methods with build-in methods(replace, indexOf, substring etc)
                 => user-defined methods are custom methods, that we create ourselves to perform certain task
                   /            \
       Static methods            Instance methods
    (that's what we are covering)
               right now

      Method- a function, smth that can perform certain tasks. (Like Scanner-function is to wait for users input)
      The function should contain the certain source code created for this specific function(string, int, etc)
      It groups a series of code fragments to perform a task. You can reuse the method you created to reuse it without the need to write everything all over again
      Since the code fragments will be stores inside the method function

      !!!method is a container for a set of functions. its not a variable, it doesn't contain value!!!

      access modifier     static modifier  return type   method name  parenthesis
        public                 static           void         displayMessage()   {
        METHOD BODY store within{} (which are code fragments)
        System.out.println("Hello world");
      }

      Access Modifiers: public, protected, default, private
                        public: always accessible
     Specifier: static, final, abstract, synchronized
                static: can be called through the class name
     Return-type: void, Any dataType
                  void: does not return any value
     MethodName: meaningful, descriptive
     Parameters: Any Data Type

      You can call this method displayMessage can be called as many times as needed, you will not have to type whatever is inside ever again
      static- allows us to call the method using just the name of the classname(method we created)
      void - means every value stays within the method
      method name better to start with LOWER case.
      method is followed by () to indicate it is a method
     */
}
