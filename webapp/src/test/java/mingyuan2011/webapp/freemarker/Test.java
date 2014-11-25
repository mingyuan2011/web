package mingyuan2011.webapp.freemarker;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

public class Test {
	
	public static void main(String[] args) throws Exception {
		Configuration configuration = new Configuration(Configuration.VERSION_2_3_21);
		configuration.setDirectoryForTemplateLoading(new File("src/test/java/mingyuan2011/webapp/freemarker/template/"));
		configuration.setDefaultEncoding("UTF-8");
		configuration.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
		
		Map root = new HashMap();
		root.put("user","Big Joe");
		Map latest = new HashMap();
		latest.put("url", "welcome.html");
		latest.put("name", "Weclome");
		root.put("latestProduct", latest);
		
		Template tpl = configuration.getTemplate("welcome.ftl");
		
		Writer out = new OutputStreamWriter(System.out);
		tpl.process(root, out);
		
	}
}
