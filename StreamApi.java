public List<Product> getProductWithText(String text)
String str = text.toLowerCase();

List<Product> prods = products.stream()
    .filter(p -> p.getName().toLowerCase().contains(str) ||
                   p.getType().toLowerCase().contains(str) ||
                   p.getPlace().toLowerCase().contains(str))
    .collect(Collectors.toList());

return prods;
