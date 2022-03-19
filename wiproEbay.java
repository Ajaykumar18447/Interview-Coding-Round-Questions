/*
Wipro’s client eBay wants to run a campaign on their website, which will have the following parameters, eBay wants that on certain x products, 
they want to calculate the final price, for each product on eBay there will be a stock unit parameter, this parameter will denote, how many 
items are their in their fulfillment center

Now, while these numbers if are positive means product x is available in the fulfillment center and if not than the product is not available
 and cannot be shipped to the customer 

Now the price on for each product varies based on the distance of the customer from the fulfillment center. Now, each product is in 
different fulfillment zone. Now, these values are 00’s kms for each centurion km. The price available would further increase by factor distance.

You’ve to find the maximum discount price for each product if the product can be shipped.

Following are the input/output parameters :

Input

1.The first line of the input will contain number of products.
2.The second line will contain price for each of these products.
3.The third line contains shipping distance in 00’s kms
4.The fourth line contains SKU’s
Output

It will contain the final price for each deliverable item in SKU’s
Example :

Input:

6
87 103 229 41 8 86
3 1 9 2 1 2
7 -21 30 0 -4 -3
Output

261 2061
*/
package interviewCodingQuestion;

import java.util.Scanner;

public class wiproEbay {
    public static void delivery(int price[] ,int distance[],int sku[] ,int n ,int finalprice[]){
        int count= 0;
        for(int i=0;i<n;i++){
            if(sku[i]>0){
            finalprice[count] += price[i] * distance[i];
            count++;
            }
        }
        for(int i=0;i<count;i++){
            System.out.print(finalprice[i] + " ");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int price[] = new int[n];
        int distance[] = new int[n];
        int sku[] = new int[n];
        int finalprice[] = new int[n];

        for(int i=0;i<n;i++){
            price[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            distance[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sku[i] = sc.nextInt();
        }


        delivery(price, distance, sku, n, finalprice);


    }

    
}
