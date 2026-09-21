public class mystring {
private String Text;
public mystring() {
Text = null;
}
public void setString(String t){
Text = t;
}
public String invert( ){
int i , n = Text.length();
char [] Temp;
Temp = Text.toCharArray();
Text= "";
for ( i=0; i<n; i++) {
if (Temp[i] >= 'A' && Temp[i] <= 'Z')
Temp[i]= (char)(Temp[i] - 'A' + 'a') ;
else if (Temp[i] >= 'a' && Temp[i] <= 'z')

Temp[i]= (char)(Temp[i] - 'a' + 'A') ;
Text += Temp[i];
}
return Text;
}
}