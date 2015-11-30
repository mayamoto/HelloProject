package part2;

import org.apache.struts2.interceptor.validation.SkipValidation;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RegexFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;

//入力チェック
@Validations(
		//必須チェック
		requiredStrings = {
			 @RequiredStringValidator(fieldName="name" ,message="名前は必ず入力してください。")
			,@RequiredStringValidator(fieldName="email" ,message="メールアドレスは必ず入力してください。")
		}
		//RFC822 形式のアドレスであること
		,emails = {
			@EmailValidator(fieldName="email" ,message="メールアドレスの文字種(半角英数字)、長さを確認してください。")
		}
		//範囲チェック
		,intRangeFields = {
			@IntRangeFieldValidator(fieldName="age" ,message="年齢は０歳から１２歳の間で入力してください。" ,min = "0" , max = "12")
		}
		//文字数チェック
		,stringLengthFields ={
			 @StringLengthFieldValidator(fieldName="name" , maxLength = "20" ,message="名前は２０文字以内で入力してください。")
			,@StringLengthFieldValidator(fieldName="email" , maxLength = "60" ,message="メールアドレスは６０文字以内で入力してください。")
		}
		//半角全角チェック
		,regexFields = {
			 @RegexFieldValidator(fieldName="name", regex = "[^0-9]*", message="${getText('errors.required.name')}")
			,@RegexFieldValidator(fieldName="age", regex = "^[0-9]+$", message="年齢は半角数値で入力してください。")
		}
)


public class Research extends ActionSupport{
	private static final long serialVersionUID = 1L;

	private String name;
	private String email;
	private int age;
	private String character;
	private String characterName;



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCharacter() {
		if (character == null){
			character = "1";
		}
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		if (character.equals("1")){
			characterName = "スヌーピー";
		} else if (character.equals("2")){
			characterName = "アンパンマン";
		} else if (character.equals("3")){
			characterName = "ふなっしー";
		}
		this.characterName = characterName;
	}

	//デフォルトのActionメソッド
	@SkipValidation
	public String execute() throws Exception{
		return "success";
	}

	//submitのときのActionメソッド
	public String confirm() throws Exception{
		return "success";
	}

	//戻るときのActionメソッド
	public String Return() throws Exception{
		return "success";
	}
}
