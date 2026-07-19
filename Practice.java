public class Practice{
    public static void main(String[] args){

        Level level = Level.ADVANCED;
        if(level == Level.BEGINNER){
            System.out.println("Beginner level");


    }else if(level == Level.INTERMEDIATE){
            System.out.println("Intermediate level");
        }else{
            System.out.println("Advanced level");
        }

        Day day = Day.MONDAY;
        if(day.isWeekend()){
            System.out.println("It's weekend");
        }else{
            System.out.println("It's a weekday");
        }

        //trafficlights

        TrafficLight trafficlight = TrafficLight.YELLOW;
        if(trafficlight == TrafficLight.GREEN){
            System.out.println(trafficlight.action());
        }else if(trafficlight == TrafficLight.RED){
            System.out.println(trafficlight.action());
        }else{
            System.out.println(trafficlight.action());
        }


        //planets
         Planet planet = Planet.JUPITER;

         if(planet ==Planet.EARTH){
            System.out.println(planet.climate()+","+ planet.getDistanceFromSun());
         }else if (planet == Planet.JUPITER){
             System.out.println(planet.climate()+","+ planet.getDistanceFromSun());
         }else if (planet == Planet.VENUS){
             System.out.println(planet.climate()+","+ planet.getDistanceFromSun());
         }else{
            System.out.println(planet.climate()+","+ planet.getDistanceFromSun());
         }



          //seasons
           Season season = Season.MONSOON;
           if(season == Season.MONSOON){
            System.out.println(season.activity()+","+season.getAvgTemperature());
           }else if(season == Season.SUMMER){
            System.out.println(season.activity()+","+season.getAvgTemperature());
           }else if(season == Season.SPRING){
            System.out.println(season.activity()+","+season.getAvgTemperature());
           }else{
            System.out.println(season.activity()+","+season.getAvgTemperature());
           }
    }

   

   
    }
    

enum Level{
BEGINNER,INTERMEDIATE,ADVANCED
}
enum Day{
    MONDAY(false), TUESDAY(false), WEDNESDAY(false), THURSDAY(false), FRIDAY(false), SATURDAY(true), SUNDAY(true);
    private final boolean isWeekend;
    Day(boolean isWeekend){
        this.isWeekend = isWeekend;
    }
    public boolean isWeekend(){
        return isWeekend;
    }
}
enum TrafficLight{
RED{
    @Override
    public String action(){
        return "STOP";
    }
},
GREEN{
     @Override
    public String action(){
        return "GO";
    }
},
YELLOW{
     @Override
public String action(){
return "GET READY";
}
};
  public abstract String action(); 
}


//planet   



enum Planet{
MERCURY(10.1){
    @Override
    public String climate(){
        return "EXTREME HOT";
    }
},
   VENUS(1000.1){
     @Override
    public String climate(){
return "HOT";
    }


},
 EARTH(100110.1){
     @Override
    public String climate(){
return "COOL";
    }


},
 JUPITER(1000.1){
     @Override
    public String climate(){
return "MODERATE";
    }


};
 private final double distanceFromSun;
 Planet(double distanceFromSun){
    this.distanceFromSun = distanceFromSun;
 }
 public double getDistanceFromSun(){
    return distanceFromSun;
 }



public abstract String climate();
}

enum Season{
    WINTER(10){
        @Override
        public String activity(){
            return "WEAR clothes";
        }

    },
    SUMMER(32){
        @Override
        public String activity(){
            return "HYDRATED";
        }

    },
    SPRING(445){
        @Override
        public String activity(){
            return "WALK";
        }

    },
     MONSOON(122){
        @Override
        public String activity(){
            return "RAINCOAT";
        }

    };
  private final int avgTemperature;
     Season(int avgTemperature){
    this.avgTemperature = avgTemperature;
  }
  public int getAvgTemperature(){
    return avgTemperature;
  }

    public abstract String activity();
}