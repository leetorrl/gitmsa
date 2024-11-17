/** @type {import('next').NextConfig} */
const nextConfig = {
  experimental: {
    serverActions: true,
  },
  images: {
    remotePatterns: [
      {
        hostname: 'books.google.com'
      },
      {
        hostname: 'wikibook.co.kr'
      },
    ]
  },
};

export default nextConfig;
