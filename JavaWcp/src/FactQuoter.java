import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactQuoter {
    public static void main(String[] args) throws IOException{
        //ユーザーのテキスト入力を読むために、BufferedReaderを設定
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //無限ループ
        for(;;){
            //ユーザにプロンプトを表示
            System.out.print("FactQuoter> ");
            //ユーザが入力した行を読む
            String line = in.readLine();
            //ファイルの終わりになったか、あるいはユーザがquitをタイプした場合、
            //入力行を解析し、階乗を計算して、結果を表示
            try{
                int x = Integer.parseInt(line);
                System.out.println(x + "! = " + Factorial4.factorial(x));
            }
            //何か問題が発生したら、エラーメッセージを表示
            catch(Exception e) { System.out.println("Invalid Input"); }
        }
    }
}