SUMMARY = "Collection of additional Wayland protocols"
DESCRIPTION = "Wayland protocols that add functionality not \
available in the Wayland core protocol. Such protocols either add \
completely new functionality, or extend the functionality of some other \
protocol either in Wayland core, or some other protocol in \
wayland-protocols."
HOMEPAGE = "http://wayland.freedesktop.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=c7b12b6702da38ca028ace54aae3d484 \
                    file://stable/presentation-time/presentation-time.xml;endline=26;md5=4646cd7d9edc9fa55db941f2d3a7dc53"

SRC_URI = "https://wayland.freedesktop.org/releases/${BPN}-${PV}.tar.xz \
           "
SRC_URI[md5sum] = "8d0338556d77ad86d7fca84ff086af88"
SRC_URI[sha256sum] = "3afcee1d51c5b1d70b59da790c9830b354236324b19b2b7af9683bd3b7be6804"

inherit allarch autotools pkgconfig

PACKAGES = "${PN}"
FILES_${PN} += "${datadir}/pkgconfig/wayland-protocols.pc"
