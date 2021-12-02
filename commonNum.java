import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class commonNum
{
	public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap();
        
        int m,n, val=0, flag = 0, common = 0;
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        n = s.nextInt();
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                
                val = s.nextInt();
                
                if(map.containsKey(val)){
                    map.put(val, map.get(val)+1);
                    if(map.get(val) == m){
                        common = val;
                        flag++;
                    }
                }else{
                    map.put(val, 1);
                }
                
            }
            
        }
        
        if(flag == 0){
            System.out.println("no element is present in all rows");
        }else{
            System.out.println("number present in all rows: "+common);
        }
        
	}
}