public class MsgProcessor {

    private String msg;

    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }

    public String process(){
        //process the html tag<>
        String r = msg.replace('<','[').replace('>',']');
        //String r = msg.replace('<','[');
        //r=r.replace('>',']');

        //process the sensitive words
        r = r.replace("被就业","就业").replace("敏感","");

        return r;
    }

}
