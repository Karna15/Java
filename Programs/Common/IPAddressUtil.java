package Programs.Common;

public class IPAddressUtil {

	public static void main(String[] args) {

		// Scanner in = new Scanner(System.in);
		// System.out.println("Please enter IP Address.");
		// String ip = in.nextLine();
		String ip = "138.38.228.53";
		String subnet = "255.255.254.0";

		System.out.println("IPV6Compressed - " + IPV6Compressed(ip));
		System.out.println("IPV6Expanded - " + IPV6Expanded(ip));
		System.out.println("Network address - " + networkAddr(ip, subnet));
		System.out.println("CIDR Notation - " + cidrNotation(ip, subnet));

	}

	private static String networkAddr(String ip, String subnet) {
		String ipbinary = "";
		String ipConvert = toBinary(ip);
		String subnetConvert = toBinary(subnet);

		String[] ipAddr = ipConvert.split("\\.");
		String[] subnetMask = subnetConvert.split("\\.");

		for (int i = 0; i < ipAddr.length; i++) {

			String input1 = ipAddr[i];
			String input2 = subnetMask[i];
			String output = addNum(input1, input2);
			int hexa = Integer.parseInt(output, 2);
			ipbinary = ipbinary + hexa + ".";
		}

		ipbinary = ipbinary.substring(0, ipbinary.length() - 1);
		return ipbinary;
	}

	private static String addNum(String b1, String b2) {
		String output = "";
		for (int i = 0; i < b1.length(); i++) {
			if (b1.substring(i, i + 1).equals(b2.substring(i, i + 1))) {
				output = output + b1.substring(i, i + 1);
			} else {
				output = output + "0";
			}
		}
		return output;
	}

	private static String cidrNotation(String ip, String subnet) {

		int count = 0;
		String subnetConvert = toBinary(subnet);

		for (int i = 0; i < subnetConvert.length() - 1; i++) {
			if (subnetConvert.substring(i, i + 1).equals("1")) {
				count++;
			}
		}

		return ip + "/" + count;
	}

	public static String IPV6Compressed(String ip) {
		String binaryOctet = "";
		String convert = "";
		String[] octetArray = ip.split("\\.");
		for (String string : octetArray) {
			convert = dectoHex(Integer.parseInt(string));
			if (convert.length() == 1) {
				convert = "0" + convert;
			}
			binaryOctet = binaryOctet + convert;
			if (binaryOctet.length() == 4) {
				binaryOctet = binaryOctet + ":";
			}
		}
		return "::FFFF:" + binaryOctet;
	}

	public static String IPV6Expanded(String ip) {
		String binaryOctet = "";
		String convert = "";
		String[] octetArray = ip.split("\\.");
		for (String string : octetArray) {
			convert = dectoHex(Integer.parseInt(string));
			if (convert.length() == 1) {
				convert = "0" + convert;
			}
			binaryOctet = binaryOctet + convert;
			if (binaryOctet.length() == 4) {
				binaryOctet = binaryOctet + ":";
			}
		}
		return "0000:0000:0000:0000:0000:FFFF:" + binaryOctet;
	}

	public static String dectoHex(int dec) {
		String hexNumber = Integer.toHexString(dec);
		hexNumber = hexNumber.toUpperCase();
		return hexNumber;
	}

	public static String toBinary(String address) {
		String binaryOctet = "";
		String output = "";
		String[] octetArray = address.split("\\.");

		for (String string : octetArray) {
			int octet = Integer.parseInt(string);
			binaryOctet = Integer.toBinaryString(octet);
			if (binaryOctet.length() < 8) {
				binaryOctet = String.format("%08d", Integer.parseInt(binaryOctet));
			}
			output = output + binaryOctet + ".";

		}
		output = output.substring(0, output.length() - 1);
		return output;
	}

}
