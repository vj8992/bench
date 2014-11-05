package my.firstapp;

public class calculator {

		//sorting techniques
		  //bubble sort
		public static int[] bubbleSort(int[] array)
			{
				int lenD = array.length;
				int tmp = 0;
				for(int i = 0;i<lenD;i++)
					for(int j = (lenD-1);j>=(i+1);j--)
						if(array[j]<array[j-1])
						{
							tmp = array[j];
							array[j]=array[j-1];
							array[j-1]=tmp;
						}
				return array;
			}
	      //SELECTION SORT
		  
		public static int[] selectionSort(int[] array)
			{
				int lenD = array.length;
				int j = 0;
				int tmp = 0;
				for(int i=0;i<lenD;i++)
				{
					j = i;
					for(int k = i;k<lenD;k++)
					{
						if(array[j]>array[k])
							j = k;
						
					}
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
				return array;
			}
			//INSERTION SORT
		public static int[] insertionSort(int[] array)
			{
				int len = array.length;
				int key = 0;
				int i = 0;
				for(int j = 1;j<len;j++)
				{
					key = array[j];
					i = j-1;
					while(i>=0 && array[i]>key)
					{
						array[i+1] = array[i];
						i = i-1;
						array[i+1]=key;
					}
				}
				return array;
			}
		//QUICK SORT
			public static int[] quickSort(int[] array)
				{
					int lenD = array.length;
					int pivot = 0;
					int ind = lenD/2;
					int i,j = 0,k = 0;
					if(lenD<2)
						return array;

					else
					{
						int[] L = new int[lenD];
						int[] R = new int[lenD];
						int[] sorted = new int[lenD];
						pivot = array[ind];
						for(i=0;i<lenD;i++)
						{
							if(i!=ind)
							{
								if(array[i]<pivot)
								{
									L[j] = array[i];
										j++;
								}
							else{
								R[k] = array[i];
								k++;
								}
							}
						}
						int[] sortedL = new int[j];
						int[] sortedR = new int[k];
						System.arraycopy(L, 0, sortedL, 0, j);
						System.arraycopy(R, 0, sortedR, 0, k);
						sortedL = quickSort(sortedL);
						sortedR = quickSort(sortedR);
						System.arraycopy(sortedL, 0, sorted, 0, j);
						sorted[j] = pivot;
						System.arraycopy(sortedR, 0, sorted, j+1, k);
						return sorted;
					}
			}
		
		// MERGE SORT
		public static int[] mergeSort(int[] array)
			{
				int lenD = array.length;
				if(lenD<=1)
					return array;
				else
				{
					int[] sorted = new int[lenD];
					int middle = lenD/2;
					int rem = lenD-middle;
					int[] L = new int[middle];
					int[] R = new int[rem];
					System.arraycopy(array, 0, L, 0, middle);
					System.arraycopy(array, middle, R, 0, rem);
					L = calculator.mergeSort(L);
					R = calculator.mergeSort(R);
					sorted = merge(L, R);
					return sorted;
				}
			}
	 
			public static int[] merge(int[] L, int[] R)
				{
					int lenL = L.length;
					int lenR = R.length;
					int[] merged = new int[lenL+lenR];
					int i = 0;
					int j = 0;
					while(i<lenL||j<lenR)
					{
						if(i<lenL & j<lenR)
						{
							if(L[i]<=R[j])
								{
									merged[i+j] = L[i];
									i++;
								}
							else
								{
									merged[i+j] = R[j];
									j++;
								}
						}
						else if(i<lenL)
							{
								merged[i+j] = L[i];
								i++;
							}
						else if(j<lenR)
							{
								merged[i+j] = R[j];
								j++;
							}
					}
					return merged;
				}
		
		// HEAP SORT
			
			
		// SEARCHING METHODS--------------
		
		
		//  LINEAR SEARCH
			
			public static int linerSearch(int[] arr, int key)
				{
					int size = arr.length;
					for(int i=0;i<size;i++)
					{
						if(arr[i] == key)
							return i;
					}
					return -1;
				}
	     
		 
		//  BINARY SEARCH
		
			public static int binarySearch(int[] inputArr, int key)
				{
	         
					int start = 0;
					int end = inputArr.length - 1;
					int pos= calculator.recursiveBinarySearch(inputArr,start,end,key);
					return pos;
					
				}
			public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key)
				{
	         
					if (start < end) 
					{
						int mid = start + (end - start) / 2;  
						if (key < sortedArray[mid])
							{
								return recursiveBinarySearch(sortedArray, start, mid, key);
						 
							} 
						else if (key > sortedArray[mid])
							{
								return recursiveBinarySearch(sortedArray, mid+1, end , key);
						 
							} 
						else 
							{
								return mid;   
							}
					}
					return -(start + 1);  
				}
		
		
		
		
		
		public static int[] cloneArray(int[] array)
			{
				int[] clone = new int[array.length];
				for(int i=0; i<array.length; i++)
					clone[i] = array[i];
				return clone;
			}

		public static int maxOfArray(int[] array)
			{
				int max = array[0];

				for(int i=1; i< array.length; i++)
					if( array[i] > max)
						max = array[i];
				return max;
			}

		public static int[] genereateArray(int size)
			{
				int[] array = new int[size];
				for(int i=0; i<array.length; i++)
					array[i] = (int)(Math.random() * 1000);
				return array;
			}
		public static int[] generateascendingarray(int size)
		{
			int[] array = new int[size];
			for (int i = 0; i < array.length; i++) {
				array[i] = i;
			}
			return array;
		}
		public static int[] generatedescendingarray(int size)
		{
			int[] array = new int[size];
			for (int i = array.length-1; i>=0; i--) {
				array[i] = i;
			}
			return array;
		}

		public static int sumOfArray(int[] array)
			{
				int result = 0;
				for(int i=0; i < array.length; i++)
					result += array[i];
				return result;
			}

		public static void printArray(int[] array)
			{
				System.out.println();
				for(int num : array)
				System.out.print("\t"+num);
				
			
				/*for(int i=0; i<array.length; i++)
				System.out.println(array[i]);*/
				System.out.println();
			}

		public static int[] genereateNaturalArray(int size)
			{
				int[] array = new int[size];
				for(int i=0; i<array.length; i++)
					array[i] = i;
				return array;
			}

		public static int[] generateEvenNumbers(int from, int to)
			{
				int[] array = new int[(to-from)/2 + 1];
				int count = 0;
				for(int i=from; i<to; i++)
				{
					if(i%2==0)
					{
						array[count] = i;
						count++;
					}
				}

				return array;
			}

		public static boolean isPrime(int num)
			{
				int i;
				for(i=2; i<num/2; i++)
				{
					if(num % i == 0)
						break;

				}
				if(num == i)
					return true;
				else 
					return false;
					
			}

		public static double add(double... array)
			{
				double result = 0;
				for(int i=0; i<array.length; i++)
					result += array[i];
				return result;
			}


		public static double add(double num1, double num2)
			{	
				double sum = num1 + num2;
				return sum;
			}

		public static int add(int num1, int num2)
			{	
				int sum = num1 + num2;
				return sum;
			}

		public static void isEven()
			{
				int num3 = 12312;
				if(num3 % 2 == 0)
					System.out.println(true);
				else 
					System.out.println(false);
			}
	}
	
	
