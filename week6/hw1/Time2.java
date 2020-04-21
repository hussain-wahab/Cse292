/***
* CSE292 - Fall 2019

*Time2.java

* Purpose: Prints a message to the screen.

* @author Hussain Alabdrabalnabi

* @ version 13.0.0

*/
public class Time2
{
// declare time variables
   private int hour;  
   private int minute; 
   private int second; 

   public Time2()
   {
//constructor with three arguments
      this( 0, 0, 0 );
   } 
// Time2 constructor: hour supplied, minute and second defaulted to 0
   public Time2( int h ) 
   { 
// constructor with three arguments
      this( h, 0, 0 ); 
   } 
// Time2 constructor: hour and minute supplied, second defaulted to 0
   public Time2( int h, int m ) 
   { 
// constructor with three arguments
      this( h, m, 0 ); 
   }
// Time2 constructor: hour, minute and second supplied
   public Time2( int h, int m, int s ) 
   { 
// constructor with three arguments
      setTime( h, m, s ); 
   } 
   
   public Time2( Time2 time )
   {
      // constructor with three arguments
      this( time.getHour(), time.getMinute(), time.getSecond() );
   } 

   public void setTime( int h, int m, int s )
   {
      setHour( h );   // set the hour
      setMinute( m ); // set the minute
      setSecond( s ); // set the second
   } 
//set Hour
   public void setHour( int h ) 
   { 
      hour = ( ( h >= 0 && h < 24 ) ? h : 0 ); 
   } 

   //  set minute 
   public void setMinute( int m ) 
   { 
      minute = ( ( m >= 0 && m < 60 ) ? m : 0 ); 
   } 

   // validate and set second 
   public void setSecond( int s ) 
   { 
      second = ( ( s >= 0 && s < 60 ) ? s : 0 ); 
   } 

   // get hour value
   public int getHour() 
   { 
      return hour; 
   } 

   // get minute value
   public int getMinute() 
   { 
      return minute; 
   } 

   // get second value
   public int getSecond() 
   { 
      return second; 
   } 

   public String toUniversalString()
   {
      return String.format( 
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
   } // end method toUniversalString

   public String toString()
   {
      return String.format( "%d:%02d:%02d %s", 
         ( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
         getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
   } 
} // end class Time2