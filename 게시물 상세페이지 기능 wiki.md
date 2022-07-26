- [영상 - 게시물 상세페이지 구현중](https://www.youtube.com/watch?v=5NWYNbMtuy8)

```java
else if (cmd.startsWith("article detail ")) {

				String[] cmdBits = cmd.split(" ");

				int id = Integer.parseInt(cmdBits[2]); // "2" -> 2

				boolean foundArticle = false;

				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);

					if (article.id == id) {
						foundArticle = true;
						System.out.println("이거 있던데?");
					}
				}

				if (foundArticle == false) {
					System.out.printf("%d번 게시물은 없어\n", id);
					continue;
				}
```