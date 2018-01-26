# Format
JsonUtils jsonUtils = new JsonUtils();</br>
User user = jsonUtils.jsonString(User.class, "Json String");</br>
User user = jsonUtils.jsonString(User.class, byte[]);</br>
User user = jsonUtils.jsonString(User.class, InputStream);</br>