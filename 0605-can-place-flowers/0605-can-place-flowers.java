class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
          for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed.length == 1) {
                if(flowerbed[i]==0) n--;
            } else if (flowerbed.length < 3) {
                if(flowerbed[i]==0&flowerbed[i+1]==0) n--;
                break;
            }else {
                if (flowerbed[i] == 0) {
                    if (i == 0) {
                        if (flowerbed[i]==0&flowerbed[i+1]==0) {
                            n--;
                            flowerbed[i] = 1;
                        }

                    } else if (i == flowerbed.length - 1) {
                        if(flowerbed[i]==0 & flowerbed[i-1]==0) {
                            n--;
                            flowerbed[i] = 1;
                        }
                    } else {
                        if(flowerbed[i]==0 & flowerbed[i+1]==0 & flowerbed[i-1]==0) {
                            n--;
                            flowerbed[i] = 1;
                        }

                    }
                }
            }

        }
        if (n > 0) return false; else return true;
    }
}