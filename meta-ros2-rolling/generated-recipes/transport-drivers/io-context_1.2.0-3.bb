# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "A library to write Synchronous and Asynchronous networking applications"
AUTHOR = "Joshua Whitley <whitleysoftwareservices@gmail.com>"
HOMEPAGE = "https://github.com/ros-drivers/transport_drivers"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "transport_drivers"
ROS_BPN = "io_context"

ROS_BUILD_DEPENDS = " \
    asio \
    rclcpp \
    std-msgs \
    udp-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
    asio-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    asio \
    rclcpp \
    std-msgs \
    udp-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    asio \
    rclcpp \
    std-msgs \
    udp-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/transport_drivers-release/archive/release/rolling/io_context/1.2.0-3.tar.gz
ROS_BRANCH ?= "branch=release/rolling/io_context"
SRC_URI = "git://github.com/ros2-gbp/transport_drivers-release;${ROS_BRANCH};protocol=https"
SRCREV = "c643b23ddac83542b700173d20e62fde3143ef7b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}