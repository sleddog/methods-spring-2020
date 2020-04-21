from bs4 import BeautifulSoup
import urllib.request


class AppURLopener(urllib.request.FancyURLopener):
    version = "'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_3) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/7.0.3 Safari/7046A194A'"


def read_page(url):
    opener = AppURLopener()
    response = opener.open(url)
    html = response.read()
    soup = BeautifulSoup(html, features="html.parser")
    data = {
        'url': url,
        'title': soup.title.text,
        'description': get_description(soup)
    }
    return data


def get_description(soup):
    meta_tags = soup.find_all("meta")
    for tag in meta_tags:
        if tag.get("name", None) == "description":
            return tag.get("content")
    return ""


def get_pages(filename):
    f = open(filename, "r")
    pages = []
    for line in f:
        pages.append(line.strip())
    return pages


# Build a section with this page data for markdown
# [title](url)
# - description
def format_markdown(data):
    return "[{title}]({url})\n - {description}".format(
        title=data['title'],
        url=data['url'],
        description=data['description']
    )


def read_all_pages():
    pages = get_pages("raw-articles.txt")
    buffer = ""
    for page in pages:
        data = read_page(page)
        print(data)
        buffer += format_markdown(data) + "\n\n"

    print(buffer)


if __name__ == "__main__":
    # read_all_pages()
    read_page("http://www.facebook.com")
