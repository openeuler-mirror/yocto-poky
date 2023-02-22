PV = "3.22.0"

DL_DIR = "${OPENEULER_SP_DIR}/${BPN}"

LIC_FILES_CHKSUM:remove = "file://Copyright.txt;md5=c721f56fce89ba2eadc2fdd8ba1f4d83 \
"
LIC_FILES_CHKSUM:prepend = "file://Copyright.txt;md5=31023e1d3f51ca90a58f55bcee8e2339 \
"

SRC_URI:remove = " \
           file://0002-cmake-Prevent-the-detection-of-Qt5.patch \
"

# apply openeuler source package and patches
SRC_URI:prepend = " \
           file://cmake-findruby.patch \
           file://cmake-fedora-flag_release.patch \
           file://cmake-mingw-dl.patch \
"

SRC_URI[sha256sum] = "998c7ba34778d2dfdb3df8a695469e24b11e2bfa21fbe41b361a3f45e1c9345e"

