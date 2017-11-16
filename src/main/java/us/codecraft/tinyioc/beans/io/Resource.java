package us.codecraft.tinyioc.beans.io;

/**
 * Resource是spring内部定位资源的接口。
 * <p>
 * 主要用来提供InputStream，以及一些和资源有关的操作
 * 主要的实现类有：ClassPathResource
 *
 * @author yihua.huang@dianping.com
 */
public interface Resource extends InputStreamResource {
    //这里可以做一些更多的原始操作,列举一些spring的操作

    //boolean exists();

    //boolean isReadable();

    //boolean isOpen();

    //URL getURL() throws IOException;

    //String getFilename();
}
