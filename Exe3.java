pacote  Ex3 ;

public  class  Ex3 {
    public  static  void  main ( String [] args ) {
        int [] [] n =  novo  int [ 100 ] [ 100 ];

        para ( int i =  0 ; i < 100 ; i ++ ) {
            n [ 0 ] [i] =  0 - i;
            Sistema . para fora . println (n [ 0 ] [i]);
            n [ 0 ] [i] * =  7 ;
        }
        para ( int i = 0 ; i < 100 ; i ++ ) {
            n [i] [ 0 ] = i - 0 ;
            Sistema . para fora . println (n [i] [ 0 ]);
            n [i] [ 0 ] * =  7 ;
        }
        para ( int i =  0 ; i < 100 ; i ++ ) {
            Sistema . para fora . println (n [ 0 ] [i]);
        }
        para ( int i =  0 ; i < 100 ; i ++ ) {
            Sistema . para fora . println (n [i] [ 0 ]);
        }
    }
}
