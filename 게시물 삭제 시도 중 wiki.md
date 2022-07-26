- [게시물 삭제 시도 중](https://github.com/kingssik/2022_Basic_Article_Manager/commit/b6d3009414b3c641ffcf6e3090afd9fabc823a7c)

```java
else if (cmd.startsWith("article delete ")) {

				String[] cmdBits = cmd.split(" ");

				int id = Integer.parseInt(cmdBits[2]);

				Article foundArticle = null;

				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);

					if (article.id == id) {
						foundArticle = article;
						break;
					}
				}

				if (foundArticle == null) {
					System.out.printf("%d번 게시물은 없습니다\n", id);
					continue;
				}
				// size() : 3
				// index : 0 1 2
				// id : 1 2 3

				articles.remove(id - 1);
				System.out.printf("%d번 게시물을 삭제했습니다\n", id);

			}
```