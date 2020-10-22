public class Demo {
  public static void printLoop(int n){
  for(int i = 1; i <= n; i++){
    for(int j = i; j <= n; j ++){
       System.out.print(i);
    }
    System.out.println();
  }
}

public static String arrToString(int[] arr){
String newstring = "{";
if (arr.length == 0) {
  return "{}";
}
for (int i = 0; i < arr.length; i++) {
    newstring = newstring + arr[i] + ", ";
  }
newstring = newstring.substring(0, newstring.length()-2) + "}";
return(newstring);
}

public static String arrayDeepToString(int[][] arr) {
  String newstring = "{";
  if (arr.length == 0) {
    return "{{}}";
  }
  for (int row = 0; row < arr.length; row ++) {
    newstring += arrToString(arr[row]) + ", ";
    }
  newstring = newstring.substring(0, newstring.length()-2) + "}";
  return(newstring);
  }

  public static void main(String[] args) {
    if (args.length == 0)
      printLoop(5);
    else
    printLoop(Integer.parseInt(args[0]));
}
}
