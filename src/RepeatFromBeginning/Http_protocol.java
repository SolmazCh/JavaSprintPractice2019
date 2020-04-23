package RepeatFromBeginning;

public class Http_protocol {

    public static void main(String[] args) {


        int statusCode = 500;

        String result = "";

        if(statusCode == 200){
            result = "Ok";
        }else if(statusCode == 201){
            result = "Created";
        }else if(statusCode == 202){
            result = "Accepted";
        }else if(statusCode == 301){
            result = "Moved Permanently";
        }else if(statusCode == 303){
            result = "See Other";
        }else if(statusCode == 304){
            result = "Not Modified";
        }else if(statusCode == 307){
            result ="Temporary Redirect";
        }else if(statusCode == 400){
            result = "Bad Request";
        }else if(statusCode == 401){
            result = "Unauthorized";
        }else if(statusCode == 403){
            result = "Forbidden";
        }else if(statusCode == 404){
            result = "Not Found";
        }else if(statusCode == 410){
            result = "Gone";
        }else if(statusCode == 500){
            result = "Internal Server Error";
        }else if(statusCode == 503){
            result = "Service Unavailable";
        }else{
            result ="Invalid";
        }


        System.out.println(result);










    }
}
