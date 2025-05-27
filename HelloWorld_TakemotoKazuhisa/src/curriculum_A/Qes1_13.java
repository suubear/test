package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {
		// 1,[概要]変数を宣言
		// バイト型
		byte b;
		// 短整数型
		short s;
		// 整数型
		int i;
		// 長整数型
		long lo;
		// 単精度浮動小数点数型
		float f;
		// 倍精度浮動小数点数型
		double d;
		// 文字型
		char c;
		// 文字列型
		String st;
		// ブーリアン型
		boolean bo;
		// 2,[概要]上記変数に初期値の代入
		b=0;
		s=0;
		i=0;
		lo=0;
		f=0.0f;
		d=0.0;
		c='\u0000';
		st=null;
		bo=false;
		// 3,[概要]上記変数に代入
		b=10;
		s=100;
		i=1000;
		lo=10000;
		f=9.5f;
		d=10.5;
		c='a';
		st="ハロー";
		bo=true;
		// 4,[概要]上記変数を使用し問題を解く
		// 11110
		System.out.println(b+s+i+lo);
		// 20
		System.out.println(b+b);
		// a ハロー true
		System.out.println(c+" "+st+" "+bo);
		// 11130
		// 小数点を切り捨てる処理
		double dec=Math.floor(b+s+i+lo+f+d);
		int no=(int)dec;
		// コンソール出力
		System.out.println(no);
		// 10000000000
		System.out.println(b*s*i*lo);
		// 0.105
		System.out.println(d/s);
		// -90＋改行
		System.out.println(b-s+("\n"));
		// 5,{概要}ハローJAVA2023の出力
		// String型は文字列の扱うときに使用するためint型に変更する
		int num=20;
		int num1=23;
		System.out.println("ハローJAVA"+(num+num1)+"\n");
		/*6,[概要]『』で囲われた人の情報を変数にする
		 * 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		*/
		//名前の変数宣言
		String name="山田太郎";
		//年齢の変数宣言
		int age=18;
		//身長の変数宣言
		double height=170.5;
		//体重の変数宣言
		double weight=62.2;
		//好きな食べ物の変数宣言
		String favoriteFood="寿司";
		/*formatの通りコンソールに出力
		 * ローカル変数に代入し○○に入れる
		 * ↓↓format↓↓
		「初めまして○○です」
		「年齢は○○歳です」
		「身長は○○cmです」
		「体重は○○kgです」
		「好きな食べ物は○○です」
		 */
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+favoriteFood+"です"+"\n");
		//7,[概要]６で作成した自己紹介にBMIが出力されるようにする(小数点第一位以降切り捨てて表示)
		double heightBmi=height/100;
		double bmi=weight/(heightBmi*heightBmi);
		System.out.println("BMIは"+(Math.floor(bmi*10))/10+"です"+"\n");
		//8,[概要]6で宣言した変数に再代入してコンソール出力する
		/*
		 *以下再代入
		 *山田太郎→鈴木一郎
		 *１８→２４
		 *１７０．５→１６８．５
		 *６２．２→６４．２
		 *寿司→オムライス
		 * */
		name="鈴木一郎";
		age=24;
		height=168.5;
		weight=64.2;
		favoriteFood="オムライス";
		//以下コンソール出力処理
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+favoriteFood+"です");
		//BMIを計算するため変数再代入
		heightBmi=height/100;
		//宣言した変数を使い計算しコンソール出力（小数点第一位以降切り捨てて表示）
		bmi=weight/(heightBmi*heightBmi);
		System.out.println("BMIは"+(Math.floor(bmi*10))/10+"です"+"\n");
		//9[概要]8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力する
		//以下自己代入
		age*=2;
		height*=2;
		weight*=2;
		//上記コンソール出力
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+favoriteFood+"です");	
		//BMIの計算をするための変数再代入後コンソール出力
		heightBmi=height/100;
		bmi=weight/(heightBmi*heightBmi);
		//宣言した変数を使い計算しコンソール出力（小数点第二位以降切り上げて表示）
		System.out.println("BMIは"+(Math.ceil(bmi*100))/100+"です"+"\n");
		//10[概要]8で使用した年齢が25歳以上ならtrueを出力する
		boolean ageMax=(25<age)?true:false;
		System.out.println(ageMax+"\n");
		//11[概要]8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力する
		//変数を強制的にString型へ変換する
		String str=String.valueOf(age);
		String str1=String.valueOf(height);
		String str2=String.valueOf(weight);
		//コンソール出力
		System.out.println(str+" "+str1+" "+str2+"\n");
		//12[概要]11で変換した【年齢・身長】を整数型に変換して出力する
		//String型からint型へ変換
		int strInt=Integer.parseInt(str);
		int strInt1=(int)Double.parseDouble(str1);
		//コンソール出力
		System.out.println(strInt+" "+strInt1+" "+"\n");
		//13[概要]12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力する
		//真偽値の宣言
		boolean ageHeight=(25==strInt)||(160<strInt1)?true:false;
		System.out.println(ageHeight);
		
	}

}
