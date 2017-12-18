package shiazhan_03_hadoop;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Before;
import org.junit.Test;

public class HdfsClientDemo {
	FileSystem fs = null;
	@Before
	public void init() throws IOException {
	Configuration conf =	new Configuration();

	//拿到一个文件系统操作的客户端实例对象
	fs = FileSystem.get(conf);
		
	}
	@Test
	public void testUpload() throws Exception {
		fs.copyFromLocalFile(new Path("/Download/demo.txt"), new Path("/Document/access.log"));
		fs.close();
	}
}
