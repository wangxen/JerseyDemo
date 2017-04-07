package com;

/**
 * Created by wangxin on 2017/4/7.
 */
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

//Path注解设置url访问路径
@Path("/hello")
public class Demo {

    @GET //GET注解设置接受的请求类型为GET
    @Produces("text/plain") //Produces注解表示发送出去的数据类型，Consumes表示接受的数据类型
    public String getHello() {
        return "hello word...";
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getHelloByid(final @PathParam("id") String id) {
            return "hello word..."+id;
        }
}
