<template>
  <div>
    <nav
      class="relative flex w-full flex-wrap items-center justify-between bg-[#eee] py-2 shadow-dark-mild dark:bg-neutral-700 lg:py-4"
      data-twe-navbar-ref
    >
      <div class="flex w-full flex-wrap items-center justify-between px-3">
        <div class="justify-center">
          <a class="mx-2 my-1 flex items-center lg:mb-0 lg:mt-0" href="#">
            <img class="me-2" src="" style="height: 20px" alt="학사관리" loading="lazy" />
          </a>
        </div>

        <!-- Hamburger button for mobile view -->
        <button
          class="block border-0 bg-transparent px-2 text-black/50 hover:no-underline hover:shadow-none focus:no-underline focus:shadow-none focus:outline-none focus:ring-0 dark:text-neutral-200 lg:hidden"
          type="button"
          data-twe-collapse-init
          data-twe-target="#navbarSupportedContent4"
          aria-controls="navbarSupportedContent4"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <!-- Hamburger icon -->
          <span class="[&>svg]:w-7 [&>svg]:stroke-black/50 dark:[&>svg]:stroke-neutral-200">
            <svg viewBox="0 0 24 24" fill="currentColor">
              <path
                fill-rule="evenodd"
                d="M3 6.75A.75.75 0 013.75 6h16.5a.75.75 0 010 1.5H3.75A.75.75 0 013 6.75zM3 12a.75.75 0 01.75-.75h16.5a.75.75 0 010 1.5H3.75A.75.75 0 013 12zm0 5.25a.75.75 0 01.75-.75h16.5a.75.75 0 010 1.5H3.75a.75.75 0 01-.75-.75z"
                clip-rule="evenodd"
              />
            </svg>
          </span>
        </button>

        <!-- Collapsible navbar container -->
        <div
          class="!visible mt-2 hidden flex-grow basis-[100%] items-center lg:mt-0 lg:!flex lg:basis-auto"
          id="navbarSupportedContent4"
          data-twe-collapse-item
        >
          <!-- Left links -->
          <ul
            class="list-style-none me-auto flex flex-col ps-0 lg:mt-1 lg:flex-row"
            data-twe-navbar-nav-ref
          >
            <!-- Home link -->
            <li class="my-4 ps-2 lg:my-0 lg:pe-1 lg:ps-2" data-twe-nav-item-ref>
              <p
                class="text-black/60 transition duration-200 hover:text-black/80 hover:ease-in-out focus:text-black/80 active:text-black/80 motion-reduce:transition-none dark:text-white/60 dark:hover:text-white/80 dark:focus:text-white/80 dark:active:text-white/80 lg:px-2"
                aria-current="page"
              >
                헤더
              </p>
            </li>
          </ul>

          <div class="flex items-center"></div>
        </div>
      </div>
    </nav>
  </div>
</template>

<script setup></script>

<style lang="scss" scoped></style>
