public class StringConcat {
	public String join(int array[]) {
		return join(array, ',');
	}

	public String join(int array[], char delimiter) {
		StringBuffer stringBuffer = new StringBuffer();
		for (int index = 0; index < array.length; index++) {
			if (index != array.length - 1)
				stringBuffer.append("" + array[index] + delimiter + " ");
			else
				stringBuffer.append("" + array[index]);

		}
		return stringBuffer.toString();

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		StringConcat sc = new StringConcat();
		System.out.println(sc.join(arr,'!'));
	}
}