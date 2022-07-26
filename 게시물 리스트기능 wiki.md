- [영상 - 게시물 리스트 기능 구현](https://www.youtube.com/watch?v=eyoViLak4a0)

```java
else if (cmd.equals("article list")) {
				if (articles.size() == 0) {
					System.out.println("게시물이 없습니다");
					continue;
				}
				System.out.println("번호    |   제목");
				for (int i = articles.size() - 1; i >= 0; i--) {
					Article article = articles.get(i);

					System.out.printf("%d	|	%s\n", article.id, article.title);
				}

			}
```