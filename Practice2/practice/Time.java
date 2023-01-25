package practice;

public class Time { 
 private int hour; 
 private int minute; 
 private int second; 
  
 public Time(int hour) { 
  setTime(hour); 
 } 
 public Time(int hour, int minute) { 
  setTime(hour, minute); 
 } 
 public Time(int hour, int minute, int second){ 
  setTime(hour, minute, second); 
 } 
  
 // 
 public void setTime(int hour) { 
  if(hour>23) { 
   this.hour = hour%24; 
  }else { 
   this.hour = hour; 
  } 
 } 
 public void setTime(int hour, int minute) { 
  if(minute%60==0) { 
   hour = hour + (minute/60); 
  } 
  else if(minute>60) { 
   hour = hour + (minute/60); 
   this.minute = minute%60; 
  }else { 
   this.minute = minute; 
  } 
  setTime(hour); 
 } 
 public void setTime(int hour, int minute, int second) { 
  if(second%60==0) { 
   minute = minute+(second/60); 
  } 
  else if(second>60) { 
   minute = minute + (second/60); 
   this.second = second%60; 
  }else { 
   this.second = second; 
  } 
  setTime(hour, minute); 
 } 
 // 
 public String toUniversal() { 
  String s = ""; 
  if(this.hour < 9) { 
   s+= "0" + this.hour; 
  }else { 
   s= s + this.hour; 
  } 
  s+=":"; 
  if(this.minute < 9) { 
   s+= "0" + this.minute; 
  }else { 
   s= s + this.minute; 
  } 
  s+=":"; 
  if(this.second<9) { 
   s+= "0" + this.second; 
  }else { 
   s= s + this.second; 
  } 
  return s; 
 } 
 public String toStandart() { 
  String s = ""; 
  if(this.hour>12) { 
   s+= (this.hour - 12) + ":"; 
   if(this.minute<9) { 
    s+= "0" + this.minute; 
   }else { 
    s= s + this.minute; 
   } 
   s+=":"; 
   if(this.second<9) { 
    s+= "0" + this.second; 
   }else { 
    s= s + this.second; 
   } 
   s+=" PM"; 
  }else { 
   s+= "0" + this.hour + ":"; 
   if(this.minute<9) { 
    s+= "0" + this.minute; 
   }else { 
    s= s + this.minute; 
   } 
   s+=":"; 
   if(this.second<9) { 
    s+= "0" + this.second; 
   }else { 
    s= s + this.second; 
   } 
   s+=" AM"; 
  } 
  return s; 
 } 
 public String toString() { 
  return this.toStandart(); 
 } 
 public void add(Time t1) { 
  int hour = this.hour + t1.hour; 
  int minute = this.minute + t1.minute; 
  int second = this.second + t1.second;  
  setTime(hour, minute, second); 
 } 
  
}
