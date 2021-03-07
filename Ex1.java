pacote  Ex1 ;


public  class  Ex1 {
    public  static  void  main ( String [] args ) {
        int [] n =  novo  int [ 9 ];

        para ( int i =  0 ; i < 9 ; i ++ ) {
            n [i] = i;
        }

        para ( int i =  0 ; i < 9 ; i ++ ) {
            Sistema . para fora . println (n [i]);
            n [i] * =  3 ;
        }

        para ( int i =  0 ; i < 9 ; i ++ ) {
            Sistema . para fora . println (n [i]);
        }
    }
}
