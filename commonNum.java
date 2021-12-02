import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class commonNum
{
	public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap();
        
        int m,n, val=0, flag = 0, common = 0, k=0;
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        n = s.nextInt();

        int[] commonNums = new int[m*n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                
                val = s.nextInt();
                
                if(map.containsKey(val)){
                    map.put(val, map.get(val)+1);
                    if(map.get(val) == m){
                        commonNums[k++] = val;
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
            System.out.println("");
            for(int i = 0; i <= k-1; i++){
                System.out.println(commonNums[i]+" ");
            }
        }
        
	}
}