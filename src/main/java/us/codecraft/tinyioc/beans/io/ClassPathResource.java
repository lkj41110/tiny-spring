package us.codecraft.tinyioc.beans.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by luokai on 2017/9/1.
 */
public class ClassPathResource implements Resource {

    private String path;

    private ClassLoader classLoader;    //类加载器


    public ClassPathResource(String path) {
        this(path, null);
    }

    public ClassPathResource(String path, ClassLoader classLoader) {
        //TODO 需要对文件路径进行处理校验
        this.path = path;
        this.classLoader = (classLoader == null ? ClassPathResource.class.getClassLoader() : classLoader);
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return null;
    }
}
