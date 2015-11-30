package part3;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletResponse;

import lombok.Getter;
import lombok.Setter;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.istack.internal.logging.Logger;

/* csv出力(一時ファイルあり)あああ */
@Getter
@Setter
public class DownloadAction extends ActionSupport{

	private String name;
	private String email;
	private int age;
	private String characterName;

	private static Logger logger = Logger.getLogger(DownloadAction.class);

	//デフォルトシリアルバージョンID
	private static final long serialVersionUID = 1L;

	public String execute() throws Exception {
		return "success";
	}

	public String download() throws Exception{

		HttpServletResponse res = ServletActionContext.getResponse();

		//コンテンツタイプの設定
		res.setContentType("application/octet-stream;charset=UTF-8");

		//ヘッダー設定
		res.setHeader("Content-Disposition", "attachment; filename=\"users.csv\"");

        // テキスト出力ストリームに出力
        PrintWriter out = new PrintWriter(new OutputStreamWriter(res.getOutputStream(), "Windows-31J"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");



        //書き出す内容を指定する
        out.print(getName() + ",");
        out.print(getEmail() + ",");
        out.print(getAge() + ",");
        out.close();

		//ダウンロード処理を実行
		return "success";
	}

}

