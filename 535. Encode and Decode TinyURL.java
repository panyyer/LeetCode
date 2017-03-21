public class Codec {
    Map<String,String> m = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
		m.put(String.valueOf(m.size()),longUrl);
		return String.valueOf(m.size()-1);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return m.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));