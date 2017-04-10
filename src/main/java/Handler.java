/**
 * Created by madeleine on 2017-04-05.
 */
public class Handler {

import static spark.Spark.*;

    public class HelloWorld {
        public static void main(String[] args) {
            get("/hello", (req, res) -> "Hello World");
        }
    }

}
