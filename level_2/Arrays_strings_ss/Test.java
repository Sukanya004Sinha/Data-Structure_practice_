public class Test{
    public boolean isLongPressedName(String name, String typed){
        if(name.kength()>typed.length()) return false;
        int i = 0;
        int j=0;
        while(i<name.length() && j<typed.length()){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }
            else if(0<=i-1 && name.charAt(i-1)==typed.charAt(j)){
              j++;
            }
            else{
                return false;
            }                
            }        
            while(j<typed.length()){
                if(typed.charAt(j)!=name.charAt(i-1)){
                    return false;
                }  
                j++;
                          }
                          return i<name.length()?false:true;


    }
    /**************************************************************************/

    //container with most water   Brute Force
     public int maxArea(int[] height) {
        int Area =0;
        for(int i =0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int minh = j-i;
                Area = Math.max(Area,Math.min(height[i], height[j])*minh);
            }
        }
        return Area;
    }
/***************************************************************/
public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int water = 0;
        while(i<j){
            int width = j-i;
            int h= Math.min(height[i],height[j]);
            water = Math.max(water, h*width);
            if(height[i]<height[j])
                i++;
                else
                j--;
            
        }
        return water;
    }
}
/**********************************************************/
}
