from http.server import HTTPServer, BaseHTTPRequestHandler

class MyHandler(BaseHTTPRequestHandler):
    def do_GET(self):
        self.send_response(200)
        self.end_headers()
        self.wfile.write(b"Hello World from Kubernetes!")

server = HTTPServer(("0.0.0.0", 80), MyHandler)
print("Server running on port 80", flush=True)
server.serve_forever()